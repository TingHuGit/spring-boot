package org.tinghu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tinghu.domain.Demo;

public interface DemoRepository extends JpaRepository<Demo, Long>{

}
