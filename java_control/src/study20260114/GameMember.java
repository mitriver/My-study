package study20260114;

public class GameMember {

	private String name;
	private String birth;
	private String nickname;
	private int level;
	
	public GameMember() {
		super();
	}
	public GameMember(String name, String birth, String nickname, int level) {
		super();
		this.name = name;
		this.birth = birth;
		this.nickname = nickname;
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	@Override
	public String toString() {
		return "GameMember [name=" + name + ", birth=" + birth + ", nickname=" + nickname + ", level=" + level + "]";
	}
	
	
}
