package raymond.dao;

import org.apache.ibatis.annotations.Param;
import raymond.pojo.TestObj;

import java.util.List;
public interface TestMapper
{
    int addObj(TestObj testObj);

    int deleteObjById(@Param("objID") int id);

    int updateObj(TestObj testObj);

    List <TestObj> queryAllObj();

    TestObj queryObjByID(@Param("objID") int id);

}
