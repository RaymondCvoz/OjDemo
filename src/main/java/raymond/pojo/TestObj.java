package raymond.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestObj
{
    private int objID;
    private String objName;
    private int objCount;
    private String detail;
}
