package org.schabi.newpipe.settings.tabs;

import org.json.JSONObject;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class TabTest {
    @Test
    public void checkIdDuplication() {
        final Set<Integer> usedIds = new HashSet<>();

        for (Tab.Type type : Tab.Type.values()) {
            final boolean added = usedIds.add(type.getTabId());
            assertTrue("Id was already used: " + type.getTabId(), added);
        }
    }

    @Test
    public void checkBlank() {
        JSONObject json = new JSONObject();

        Tab test = new Tab.BlankTab();

        assertEquals(0, test.getTabId());
    }
}