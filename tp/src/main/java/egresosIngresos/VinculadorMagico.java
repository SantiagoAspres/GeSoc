package egresosIngresos;

import java.util.List;

import persistencia.OperacionEgresoMapperBD;
import persistencia.OperacionIngresoMapperBD;
import persistencia.OrganizacionMapperBD;

public class VinculadorMagico {
	public void vincular(){
		List<Organizacion> organizaciones = OrganizacionMapperBD.getInstance().obtenerOrganizaciones();
		for (Organizacion organizacion : organizaciones){
			List<OperacionIngreso> ingresos = OperacionIngresoMapperBD.getInstance().obtenerIngresosQueSeanVinculables(organizacion);
			List<OperacionEgreso> egresos = OperacionEgresoMapperBD.getInstance().obtenerEgresosQueSeanVinculables(organizacion);
			ReglaVinculacion regla = organizacion.getRegla();
			organizacion.getRequerimiento().vincular(egresos, ingresos, regla);
			OperacionIngresoMapperBD.getInstance().save(ingresos);
			OperacionEgresoMapperBD.getInstance().save(egresos);
		}
	}
}