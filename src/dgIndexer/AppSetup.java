/*
 * Copyright (C) 2014 tomas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package dgIndexer;

import java.util.HashMap;
import java.util.Map;

/**
 * Class for setup all parameters for the application.
 * @author tomas
 */
public final class AppSetup {
    
    static Map<String, String> appParameters;
    
    static {
        AppSetup.appParameters = new HashMap<String, String>();
        
        String workingDir = System.getProperty("user.dir");
        AppSetup.appParameters.put("APP_HOME", workingDir);
        //AppSetup.appParameters.put("SW_FILE_PATH", workingDir + "/share/stop-word.txt");
    }
    
    static public String getParameter(String keyParameter) {
        return AppSetup.appParameters.get(keyParameter);
    }
}
