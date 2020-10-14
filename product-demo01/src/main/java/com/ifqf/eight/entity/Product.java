package com.ifqf.eight.entity;

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
 *Time:2020/10/14 08:11
 */

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@DynamicUpdate
public class Product {
    @Id
    private Integer pId;

    private Integer tId;

    private String pName;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date pTime;

    private String pInfo;

    private BigDecimal pPrice;

    private Integer pStatus;

    private String pImage;

}
