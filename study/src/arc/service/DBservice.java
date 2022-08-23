package arc.service;

import java.util.ArrayList;

import arc.domain.arc.Arc;

public interface DBservice {
	public void 추가(Arc arc);
	public void 수정(int id, Arc arc);
	public void 삭제(int id);
	public void 한개검색(int id);
	public void 전부검색();


}
