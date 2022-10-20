package bridge;

/**
 * @description: 扩展抽象化角色
 * @Author: zhouyiming
 * @CreateTime: 2022-10-14  15:58
 */
public class Mac extends OperatingSystem{

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
