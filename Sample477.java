
package com.siemens.polarion.pack;

/**
  * Defined formats:
  * Full @wi.implements test/RT-477:1000 message
  * No revision @wi.implements test/RT-477 message
  * And no project @wi.implements RT-477 message
  * And no role @wi RT-477 message
  * Full with url @wi.implements http://polariondomain.com/polarion/#/project/test/workitem?id=RT-477&revision=5678 message
  * With HTTPS protocol @wi.implements https://polariondomain.com/polarion/#/project/test/workitem?id=RT-477&revision=5678 message
  * No revision @wi.implements http://polariondomain.com/polarion/#/project/test/workitem?id=RT-477 message
  * Multiline {@wi.implements test/RT-477:1000 message  
  * Continue
  * Continue further}
  * Another content
  */
public class Sample {

   /**
    * Mixed style links, complex pasing examples
    * Linked to @wi test/RT-477
    * Linked to {@wi test/RT-477} and {@wi test/RT-477:100}
    * Linked to {@wi test/RT-477 some message
    * Continue
    * Continue further} and {@wi test/RT-477}
    * Linked to {@wi test/RT-477} and @wi test/RT-477 last message
    * Another content
    */
    public FixtureSample()
    {

    }
}