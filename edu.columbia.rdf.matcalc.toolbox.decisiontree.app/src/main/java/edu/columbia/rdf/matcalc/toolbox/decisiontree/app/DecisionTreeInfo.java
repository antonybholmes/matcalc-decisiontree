package edu.columbia.rdf.matcalc.toolbox.decisiontree.app;

import org.jebtk.core.AppVersion;
import org.jebtk.modern.UIService;
import org.jebtk.modern.help.GuiAppInfo;

public class DecisionTreeInfo extends GuiAppInfo {

  public DecisionTreeInfo() {
    super("Decision Tree", new AppVersion(1), "Copyright (C) ${year} Antony Holmes",
        UIService.getInstance().loadIcon(DecisionTreeIcon.class, 32),
        UIService.getInstance().loadIcon(DecisionTreeIcon.class, 128));
  }

}
