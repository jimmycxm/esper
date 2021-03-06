/*
 ***************************************************************************************
 *  Copyright (C) 2006 EsperTech, Inc. All rights reserved.                            *
 *  http://www.espertech.com/esper                                                     *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 ***************************************************************************************
 */
package com.espertech.esper.common.internal.epl.namedwindow.core;

import com.espertech.esper.common.internal.context.util.EPStatementAgentInstanceHandle;
import com.espertech.esper.common.internal.context.util.EPStatementAgentInstanceHandleComparator;
import com.espertech.esper.common.internal.epl.namedwindow.consume.NamedWindowConsumerView;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class NamedWindowUtil {
    protected static Map<EPStatementAgentInstanceHandle, List<NamedWindowConsumerView>> createConsumerMap(boolean isPrioritized) {
        if (!isPrioritized) {
            return new LinkedHashMap<>();
        } else {
            return new TreeMap<>(EPStatementAgentInstanceHandleComparator.INSTANCE);
        }
    }
}
