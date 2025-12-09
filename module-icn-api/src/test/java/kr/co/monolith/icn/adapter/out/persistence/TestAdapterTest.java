package kr.co.monolith.icn.adapter.out.persistence;

import kr.co.monolith.icn.AbstractJpaTests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;

@Import(TestAdapter.class)
class TestAdapterTest extends AbstractJpaTests {

    @Autowired
    TestAdapter adapter;

}