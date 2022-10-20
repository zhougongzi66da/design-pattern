package bridge;

/**
 * @description: 抽象的操作系统类（抽象化角色）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-14  15:56
 */
public abstract class OperatingSystem {

    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
