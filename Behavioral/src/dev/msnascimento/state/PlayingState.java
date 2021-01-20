package dev.msnascimento.state;

public class PlayingState implements State {

	@Override
	public void play(MediaPlayer mediaPlayer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause(MediaPlayer mediaPlayer) {
		mediaPlayer.setState(new PauseState());
		mediaPlayer.setIcon("play button");
        System.out.println("Video paused, icon set to " + mediaPlayer.getIcon());
	}

}
