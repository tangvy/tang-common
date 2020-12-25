package com.tangv.common.util;


import com.tangv.common.enums.CodeType;

import java.util.Random;

/**
 * author:   tangwei
 * Date:     2020/12/24 13:58
 * Description:
 */
public class NumUtil {

    public static String getCode(CodeType codeType) {
        StringBuffer resultCode = new StringBuffer();
        switch (codeType) {
            case GOODS_CODE:
                String currentTime = DateUtil.currentTime();
                String sixNum = NumUtil.getSixNum();
                resultCode.append(currentTime).append(sixNum);
                break;
            default:
        }
        return resultCode.toString();
    }

    public static String getSixNum() {
        Random random = new Random();
        String num = "";
        for (int i = 0;i<6;i++) {
            num += random.nextInt(10);
        }
        return num;
    }

}