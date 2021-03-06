/* 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. 
 */
package org.drugepi.match.storage;

import java.util.Comparator;

public class MatchGroupSizeComparator implements Comparator<MatchGroup> {

	public int compare(MatchGroup o1, MatchGroup o2) {
		return Double.compare(o1.size(), o2.size());
	}
}
