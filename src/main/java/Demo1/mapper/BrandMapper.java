package Demo1.mapper;

import Demo1.pojo.Brand;

import java.util.List;

public interface BrandMapper {
        List<Brand> SelectALL();
        void addData(Brand brand);
        Brand selectById(int id);
        void updateAll(Brand brand);
        void deleteById(int id);
}
