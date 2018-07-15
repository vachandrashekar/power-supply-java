package com.powersupply.techtrial.service;

import com.powersupply.techtrial.model.Panel;

/**
 * PanelService interface for Panels.
 * @author Crossover
 *
 */
public interface PanelService {
  
  /**
   * Register a panel for electricity monitoring.
   * @param panel to register with system.
   */
  
  void register(Panel panel);
  
  Panel findBySerial(String serial);
}
