package br.com.ericmoraess.dao;

import java.util.Set;
import br.com.ericmoraess.entidade.Hospital;

public interface HospitalDAO {
	public Set<Hospital> getAll();
	public void insert(Hospital h);
	public void update(Hospital h);
	public void delete(Hospital h);
}
