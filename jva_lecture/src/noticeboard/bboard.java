package noticeboard;

public class bboard {

	public String userName; //작성자
	public String postDate; //작성일
	public String postName;// 게시글 제목
	public String article;// 본문
	
	public String search; //검색
	public int likes; // 공감 수
	public int share; //공유 수
	public int clicks;//조회수
	public int boardNum; //게시글 작성 갯 수
	
	public void postBoard() {} //게시글 작성
	public void delBoard() {} //게시글 삭제
	public void postPic() {} //사진 업로드
	public void delPic() {}//사진 삭제
	public void serchUser() {}// 유저 찾기
	public void follow() {}//팔로우
	public void unFollow() {}// 언팔로우
	public void showBoardList() {} //글 목록 펼침
	public void preBoard() {} //이전 게시글 
	public void nextBoard() {} //다음 게시글
	public void sharePic() {}//사진 공유
	
	
}
