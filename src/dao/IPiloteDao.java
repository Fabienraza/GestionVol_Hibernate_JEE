package dao;

import java.util.List;
import beans.Pilote;

public interface IPiloteDao {
	public int addPilot(Pilote add);
	public List<Pilote> getPilotList();
}
