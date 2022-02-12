package raymond.service;

import raymond.pojo.TestObj;

import java.util.List;

public interface TestService
{
    int addObj(TestObj testObj);

    int deleteObjById(int id);

    int updateObj(TestObj testObj);

    List<TestObj> queryAllObj();

    TestObj queryObjByID(int id);

}