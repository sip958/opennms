/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2018 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2018 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.netmgt.daemon;

public interface DaemonConfigService {
    DaemonDTO[] getDaemons();

    /**
     *
     * @param daemonName
     * @throws {@link java.util.NoSuchElementException} if a daemon for <code>daemonName</code> does not exist
     */
    boolean reloadDaemon(String daemonName);
    /**
     *
     * @param daemonName
     * @throws {@link java.util.NoSuchElementException} if a daemon for <code>daemonName</code> does not exist
     */
    DaemonReloadStateDTO getDaemonReloadState(String daemonName);

//
//    public static void main(String[] args) {
//        final DaemonConfigService myObject = new DefaultDaemonConfigService();
//
//        final InvocationHandler handler = (proxy, method, args1) -> {
//            long start = System.currentTimeMillis();
//            try {
//                return method.invoke(myObject, args1);
//            } finally {
//                long end = System.currentTimeMillis();
//                long took = end - start;
//                System.out.println("Execution took " + took + " ms");
//            }
//        };
//
//
//        final DaemonConfigService proxy = (DaemonConfigService) Proxy.newProxyInstance(DaemonConfigService.class.getClassLoader(),
//                new Class[] { DaemonConfigService.class },
//                handler);
//    }
}
