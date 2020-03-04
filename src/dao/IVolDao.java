package dao;

import java.util.List;
import beans.Vol;

public interface IVolDAO {
	public int addVol(Vol add);
	public List<Vol> getVolList();
}
