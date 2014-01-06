package at.bestsolution.e4.theme.css.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

import at.bestsolution.e4.theme.css.ColorProvider;
import at.bestsolution.e4.theme.css.ColorUtil;

public class E3ColorProvider implements ColorProvider {

	@Override
	public Map<String, RGB> getColors(Display d) {
		Map<String, RGB> map = new HashMap<String, RGB>();
//		map.put("ACTIVE_TAB_TEXT_COLOR", ColorUtil.getLightenedColor(d, SWT.COLOR_TITLE_FOREGROUND));

		RGB endColor = ColorUtil.getLightenedColor(d, SWT.COLOR_TITLE_BACKGROUND);
		RGB startColor = ColorUtil.blend(endColor, ColorUtil.white, SWT.COLOR_TITLE_BACKGROUND_GRADIENT);

		map.put("activeTabBgEnd", endColor);
		map.put("activeTabBgStart", startColor);

	    RGB inactiveEndColor = ColorUtil.getLightenedColor(d, SWT.COLOR_TITLE_INACTIVE_BACKGROUND);
	    RGB inactiveStartColor = ColorUtil.blend(inactiveEndColor, ColorUtil.white, SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT);

        map.put("inactiveTabBgEnd", inactiveEndColor);
        map.put("inactiveTabBgStart", inactiveStartColor);

		return map;
	}

}
