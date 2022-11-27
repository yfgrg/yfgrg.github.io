package Demo1.servlet;

import Demo1.mapper.BrandMapper;
import Demo1.pojo.Brand;
//import Demo1.util.SqlSessionFactoryUtils;
import Demo1.util.SqlSessionFactoryUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class BrandServlet {
        SqlSessionFactory sqlSessionFactory=SqlSessionFactoryUtils.getSqlSessionFactory();
    public List<Brand> SelectAll() throws IOException {
        SqlSession sqlsession=  sqlSessionFactory.openSession();
      BrandMapper brandMapper=sqlsession.getMapper(BrandMapper.class);
      List<Brand> brandList=brandMapper.SelectALL();
      sqlsession.close();
      return brandList;
    }
    public void addData(Brand brand){
       SqlSession sqlSession= sqlSessionFactory.openSession();
       BrandMapper brandMapper=sqlSession.getMapper(BrandMapper.class);
       brandMapper.addData(brand);
       sqlSession.commit();
       sqlSession.close();
    }
    public Brand selectById(int id){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        BrandMapper brandMapper=sqlSession.getMapper(BrandMapper.class);
       Brand brand =brandMapper.selectById(id);
       sqlSession.close();
       return brand;
    }
    public void updateAll(Brand brand){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        BrandMapper brandMapper=sqlSession.getMapper(BrandMapper.class);
        brandMapper.updateAll(brand);
        sqlSession.commit();
        sqlSession.close();
    }
    public void deleteById(int id){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        BrandMapper brandMapper=sqlSession.getMapper(BrandMapper.class);
        brandMapper.deleteById(id);
        sqlSession.commit();
        sqlSession.close();
    }
}
