import hmac
import math
import struct
import time
from base64 import b32decode

"""
It's just an example implementation created just for this presentation, 
It most likely not secure XD
"""


def totp(secret: bytes):
    pad_length = math.ceil(len(secret) / 8) * 8 - len(secret)
    padded_key = secret + b'=' * pad_length
    counter = int(time.time() // 30)

    # value = hmac.digest(b32decode(padded_key), struct.pack('>Q', counter), 'sha1')
    value = hmac.digest(padded_key, struct.pack('>Q', counter), 'sha1')
    offset = value[19] & 0xf

    code = struct.unpack('>I', value[offset: offset + 4])[0] & 0x7fffffff
    return code % 1_000_000


if __name__ == '__main__':
    print(totp(b'secretloool'))
