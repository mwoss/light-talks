## Allocations:
1. Allocating something on JVM is around 10 machine instructions.
2. On the other hand using something like malloc() in C is between 60-100 machine instructions.
3. Inlining classes: escape analysis

## Memory:
1. Plain object on JDK 1.3.1 on Windows - 8 bytes. 

    Does this mean that any wrapper would be 8 bytes larger than a primitive inside it?

2. An empty String is 40 bytes
3. Boolean: header 12 bytes + 1 for the boolean + 3 for the granularity

![](../../../../../../../../../var/folders/2w/9flgm0291z5_80qq7b59kwk00000gp/T/TemporaryItems/NSIRD_screencaptureui_Ps3iOE/Screenshot 2022-05-12 at 14.22.04.png)

## Garbage collector:
1. Short lived objects are very cheap. 
2. Performance of GC is determined by the number of live objects


