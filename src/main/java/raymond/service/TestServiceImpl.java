package raymond.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raymond.dao.TestMapper;
import raymond.pojo.TestObj;

import java.util.List;
@Service
public class TestServiceImpl implements TestService
{

    @Autowired
    private TestMapper testMapper;
    public void setTestMapper(TestMapper testMapper)
    {
        this.testMapper = testMapper;
    }

    @Override
    public int addObj(TestObj testObj)
    {
        return testMapper.addObj(testObj);
    }

    @Override
    public int deleteObjById(int id)
    {
        return testMapper.deleteObjById(id);
    }

    @Override
    public int updateObj(TestObj testObj)
    {
        return testMapper.updateObj(testObj);
    }

    @Override
    public List<TestObj> queryAllObj()
    {
        return testMapper.queryAllObj();
    }

    @Override
    public TestObj queryObjByID(int id)
    {
        return testMapper.queryObjByID(id);
    }
}
