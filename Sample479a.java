
package com.siemens.polarion.pack;

/**
  * Defined formats:
  * Full @wi.implements test/DPP-479:1000 message
  * No revision @wi.implements test/DPP-479 message
  * And no project @wi.implements DPP-479 message
  * And no role @wi DPP-479 message
  * Full with url @wi.implements http://polariondomain.com/polarion/#/project/test/workitem?id=DPP-479&revision=5678 message
  * With HTTPS protocol @wi.implements https://polariondomain.com/polarion/#/project/test/workitem?id=DPP-479&revision=5678 message
  * No revision @wi.implements http://polariondomain.com/polarion/#/project/test/workitem?id=DPP-479 message
  * Multiline {@wi.implements test/DPP-479:1000 message  
  * Continue
  * Continue further}
  * Another content
  */
public class Sample {

   /**
    * Mixed style links, complex pasing examples
    * Linked to @wi test/DPP-479
    * Linked to {@wi test/DPP-479} and {@wi test/DPP-479:100}
    * Linked to {@wi test/DPP-479 some message
    * Continue
    * Continue further} and {@wi test/DPP-479}
    * Linked to {@wi test/DPP-479} and @wi test/DPP-479 last message
    * Another content
    */
    public FixtureSample()
    {

    }
}