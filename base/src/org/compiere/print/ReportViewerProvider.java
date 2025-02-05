/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2007 Adempiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *
 * Copyright (C) 2007 Low Heng Sin hengsin@avantz.com
 * _____________________________________________
 *****************************************************************************/
package org.compiere.print;

import java.io.FileInputStream;


/**
 * 
 * @author Low Heng Sin
 *
 * 	@author Edwin Betancourt, EdwinBetanc0urt@outlook.com, https://github.com/EdwinBetanc0urt
 * 		@see <a href="https://github.com/adempiere/adempiere/issues/4174">
 * 		BR [ 4174 ] Swing client does not generate jasper reports.</a>
 *
 */
public interface ReportViewerProvider {
	public void openViewer(ReportEngine re);
	
	public void openViewer(String string, FileInputStream fileInputStream);

	public void openViewer(ReportEngine re, Object desktop);
}
