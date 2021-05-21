package CPUUsage;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

import com.sun.management.OperatingSystemMXBean;

class CPUUsage
{
    public static void main(String[]args){
        ThreadMXBean tmx = ManagementFactory.getThreadMXBean();
    }
}