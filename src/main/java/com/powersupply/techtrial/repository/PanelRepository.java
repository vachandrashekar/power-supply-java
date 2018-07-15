package com.powersupply.techtrial.repository;

import com.powersupply.techtrial.model.Panel;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;
/**
 * PanelRepository allows all operations to Panel Entity.
 * @author Crossover
 *
 */

@RestResource(exported = false)
public interface PanelRepository extends PagingAndSortingRepository<Panel, Long> {
  Panel findBySerial(String serial);
}
