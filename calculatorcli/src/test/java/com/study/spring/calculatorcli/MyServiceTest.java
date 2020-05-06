package com.study.spring.calculatorcli;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MyServiceTest {
    @InjectMocks
    MyService myService;

    @Mock
    CalculatorService calculatorService;

    @Test
    public void execute() throws Exception{
        // given
        int value1 = 5;
        int value2 = 10;
        given(calculatorService.plus(5, 10)).willReturn(15);
        //when

        // when
        int result = myService.execute(value1, value2);

        // then
        verify(calculatorService).plus(anyInt(), anyInt());
        Assert.assertEquals(30, result);
    }
}

//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {ApplicationConfig.class})
//public class MyServiceTest {
//	@Autowired
//	MyService myService;
//	
//	@Test
//	public void execute() throws Exception {
//		int val1 = 5;
//		int val2 = 10;
//		
//		int result = myService.execute(val1, val2);
//		
//		Assert.assertEquals(30, result);
//	}
//}
