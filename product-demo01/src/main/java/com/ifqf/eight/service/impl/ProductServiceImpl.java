package com.ifqf.eight.service.impl;

//
//                       .::::.
//                     .::::::::.
//                    :::::::::::
//                 ..:::::::::::'
//              '::::::::::::'
//                .::::::::::
//           '::::::::::::::..
//                ..::::::::::::.
//              ``::::::::::::::::
//               ::::``:::::::::'        .:::.
//              ::::'   ':::::'       .::::::::.
//            .::::'      ::::     .:::::::'::::.
//           .:::'       :::::  .:::::::::' ':::::.
//          .::'        :::::.:::::::::'      ':::::.
//         .::'         ::::::::::::::'         ``::::.
//     ...:::           ::::::::::::'              ``::.
//    ```` ':.          ':::::::::'                  ::::..
//                       '.:::::'                    ':'````..
/*
 *Author:Mamoru
 *Project:project_eight
 *Method:
 *Time:2020/10/14 08:18
 */

import com.ifqf.eight.dao.ProductDao;
import com.ifqf.eight.entity.Product;
import com.ifqf.eight.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    public List<Product> selectByTid(Integer tId) {
        return productDao.findProductByTId(tId);
    }

    @Override
    public void addProduct(Product product) {
        productDao.save(product);
    }
}
