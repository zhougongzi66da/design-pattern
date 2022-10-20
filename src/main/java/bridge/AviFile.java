package bridge;

/**
 * @description: avi视频文件（具体的实现化角色）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-14  15:54
 */
public class AviFile implements VideoFile {
    public void decode(String fileName) {
        System.out.println("avi "+fileName);
    }
}
