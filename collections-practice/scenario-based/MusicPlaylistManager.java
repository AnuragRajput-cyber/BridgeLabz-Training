package dsa_practice.scenario_based;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

class SongAlreadyExistsException extends Exception{
	public SongAlreadyExistsException(String message) {
		super(message);
	}
}
class Song{
	String songName;
	Song(String name){
		this.songName=name;
	}
	public void setSongName(String name) {
		this.songName=name;
	}
	public String getSongName() {
		return this.songName;
	}
	@Override
	public boolean equals(Object obj) {
        Song s = (Song) obj;
        return this.songName.equals(s.songName);
    }

    @Override
    public int hashCode() {
        return songName.hashCode();
    }
}
public class MusicPlaylistManager {
	LinkedList<Song>playlistOrder=new LinkedList<>();
	Stack<Song>recent=new Stack<>();
	HashSet<Song>playList=new HashSet<>();
	
	public void addSong(Song song) throws SongAlreadyExistsException {
		if(playList.contains(song)) {
			throw new SongAlreadyExistsException("Song Already Exist!");
		}else {
			playList.add(song);
			playlistOrder.add(song);
		}
	}
	public void playing(Song song) {
		recent.push(song);
		System.out.println("Playing: "+song.getSongName());
	}
	public Song getRecentPlayed() {
		return recent.peek();
	}
	public static void main(String[] args)throws SongAlreadyExistsException {
		MusicPlaylistManager player=new MusicPlaylistManager();
		try {
			Song Falani=new Song("Falani");
			Song gadi150=new Song("Gadi 150");
			Song Falani2=new Song("Falani");
			
			player.addSong(Falani);
			player.playing(Falani);
			player.addSong(Falani2);
			player.addSong(gadi150);
			player.playing(gadi150);
			
		}catch(SongAlreadyExistsException e) {
			System.out.println(e.getMessage());
		}
	}
}
