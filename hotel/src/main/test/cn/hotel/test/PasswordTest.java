package cn.hotel.test;

import cn.mafangui.hotel.service.UserService;
import cn.mafangui.hotel.utils.MD5Utils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 功能:
 * 作者: Jiang
 * 日期: 2024/2/22 14:55
 */
@SpringBootTest
public class PasswordTest {


    public static void main(String[] args) {
        System.out.println(MD5Utils.MD5Encode("123456"));
    }

    @Test
    public void adminLogin(){

    }
}
