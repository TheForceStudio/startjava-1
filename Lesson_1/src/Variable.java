public class Variable {
    public static void main(String[] args) {
        byte cpuCores = 4;
        short numOfPackages = 3600;
        int gpuMemSizeInKB = 8 * 1024 * 1024;
        long totalDiskSpaceInKB = 256 * 1024 * 1024;
        float cpuFrequencyGHz = 3.60f;
        double memorySizeGB = 6.1;
//        char[] osType = "Ubuntu".toCharArray();
        char[] osType = {85, 98, 117, 110, 116, 117} /* "Ubuntu".toCharArray() the same */;
        boolean isUpToDate = true;

        System.out.println("CPU cores count: " + cpuCores);
        System.out.println("Number of packages: " + numOfPackages);
        System.out.println("GPU memory size in KBs: " + gpuMemSizeInKB);
        System.out.println("Total disk space in KBs: " + totalDiskSpaceInKB);
        System.out.println("CPU frequency in GHz: " + cpuFrequencyGHz);
        System.out.println("Memory size in GBs: " + memorySizeGB);
        System.out.println("OS type: " + new String(osType));
        System.out.println("Is up-to-date: " + isUpToDate);
    }
}
