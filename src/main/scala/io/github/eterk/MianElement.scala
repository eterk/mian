package io.github.eterk

import io.github.eterk.mian.input.{CollectionPanel, InputPanel}


/**
 * ui library unique api
 */
object MianElement {

  val Input: (String, String) => InputPanel[_] = InputPanel.apply

  val SeqPanel: CollectionPanel.type = CollectionPanel
}
