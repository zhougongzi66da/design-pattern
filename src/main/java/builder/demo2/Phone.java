package builder.demo2;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  16:34
 */
public class Phone {
    private String cpu;
    private String screen;
    private String mainboard;
    private String memory;

    private Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.mainboard = builder.mainboard;
        this.memory = builder.memory;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", mainboard='" + mainboard + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }

    public static final class Builder{
        private String cpu;
        private String screen;
        private String mainboard;
        private String memory;

        public Builder builderCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder builderScreen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder builderMainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        public Builder builderMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public Phone build(){
            return new Phone(this);
        }
    }
}
