package restore_ip_addresses;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class RestoreIPAddressesTest {

    @Test
    public void test1() {
        RestoreIPAddresses sol = new RestoreIPAddresses();
        List<String> result = sol.restoreIpAddresses("25525511135");
        for (String item : result)
            System.out.println(item);
        assertEquals(2, result.size());
    }

    @Test
    public void test2() {
        RestoreIPAddresses sol = new RestoreIPAddresses();
        List<String> result = sol.restoreIpAddresses("010010");
        for (String item : result)
            System.out.println(item);
        assertEquals(2, result.size());
    }
}
