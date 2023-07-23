package platforms;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class FacadeSimpleStatelessListProviderFactory {
    private String dummyValue = ":3333";

    public ArrayList<String> constructList() {
        return new ArrayList<>() {
            {
                add("LOOOL");
                add("XDDDD");
                add(null);
            }
        };
    }

    @Nullable
    public String getDummyValue() {
        return dummyValue;
    }

    public void setDummyValue(String dummyValue) {
        this.dummyValue = dummyValue;
    }
}
