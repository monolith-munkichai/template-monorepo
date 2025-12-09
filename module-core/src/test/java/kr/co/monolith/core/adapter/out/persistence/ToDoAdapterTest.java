package kr.co.monolith.core.adapter.out.persistence;

import kr.co.monolith.core.AbstractJpaTests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;

@Import(ToDoAdapter.class)
class ToDoAdapterTest extends AbstractJpaTests {

    @Autowired
    ToDoAdapter adapter;

}