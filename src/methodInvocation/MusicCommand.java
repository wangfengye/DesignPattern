package methodInvocation;

/**
 * Created by lenovo on 2017/6/29.
 */
public class MusicCommand implements Command{
    Music music;

    public MusicCommand(Music music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.on();
    }

    @Override
    public void undo() {
        music.off();
    }
}
