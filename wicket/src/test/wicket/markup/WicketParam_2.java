/*
 * $Id$
 * $Revision$
 * $Date$
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package wicket.markup;

import java.util.ArrayList;
import java.util.List;

import wicket.PageParameters;
import wicket.markup.html.WebPage;
import wicket.markup.html.basic.Label;
import wicket.markup.html.list.ListItem;


/**
 * Mock page for testing.
 *
 * @author Chris Turner
 */
public class WicketParam_2 extends WebPage 
{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Construct.
	 * @param parameters
	 */
	public WicketParam_2(final PageParameters parameters) 
	{
	    final List data = new ArrayList();
	    data.add("1");
	    data.add("2");
	    data.add("3");
	    
	    add(new WicketParamListView("list", data)
        {
	    	private static final long serialVersionUID = 1L;

	    	protected void populateItem(ListItem item)
			{
				String txt = (String)item.getModelObject();
				item.add(new Label("label", txt));
			}
        });
    }
}
