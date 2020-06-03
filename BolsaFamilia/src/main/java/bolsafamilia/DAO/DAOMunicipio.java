package bolsafamilia.DAO;

import java.util.Set;
import br.com.ericmoraess.dao.filtro.FiltroConsultarMunicipioNome;
import br.com.ericmoraess.entidade.VOHMunicipio;


public interface DAOMunicipio {
	public Set <VOHMunicipio> getALL();
	
	
	public void insert(VOHMunicipio m);
	public void update(VOHMunicipio m);
	public void delete(VOHMunicipio m);
	
	
		public Set<VOHMunicipio> getAll(FiltroConsultarMunicipioNome filtro);
	
}


