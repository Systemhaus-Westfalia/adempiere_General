/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.                                     *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net                                                  *
 * or https://github.com/adempiere/adempiere/blob/develop/license.html        *
 *****************************************************************************/

package  org.spin.hr.engine;


import java.util.Map;

import org.eevolution.hr.model.MHRProcess;
import org.spin.hr.util.RuleInterface;



/** Generated Process for (groovy:R_SNET_SinAFPISSS R_SNET_SinAFPISSS)
 *  @author ADempiere (generated) 
 *  @version Release 3.9.3
 */
public class groovy_R_SNET_SinAFPISSS implements RuleInterface {

	String description = null;

	@Override
	public Object run(MHRProcess process, Map<String, Object> engineContext) {
		
		double result = 0;
		description = null;
		
		
		
		        double salarioBasico = process.getConcept("R_SBAS_NOMINA");
		        double ISR = process.getConcept("R_ISR_SinAFPISSS");
		
		        double celular =  process.getConcept("O_Celular");
		        double liqAguinaldo = process.getConcept("O_LiqAguinaldo");
		
		        result =  salarioBasico  -  ISR;
		return result;
	}

	@Override
	public String getDescription() {
		return description;
	}
}