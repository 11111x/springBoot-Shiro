package com.test.repository;


import com.test.domain.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by cdyoue on 2016/10/8.
 */

public interface PlanRepository extends JpaRepository<Plan, Long> {

    List<Plan> findByTitle(String title);

}
