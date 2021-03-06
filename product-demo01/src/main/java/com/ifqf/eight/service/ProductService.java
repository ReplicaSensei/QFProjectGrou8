package com.ifqf.eight.service;

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
 *Time:2020/10/14 08:17
 */


import com.ifqf.eight.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> selectByTid(Integer tId);

    void addProduct(Product product);

}
