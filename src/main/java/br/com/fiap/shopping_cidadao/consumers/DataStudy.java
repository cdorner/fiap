package br.com.fiap.shopping_cidadao.consumers;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.listener.ConsumerSeekAware;
import org.springframework.stereotype.Component;

import shopping_cidadao.fiap.evento.Envelope;
import shopping_cidadao.fiap.evento.Key;

@Component
public class DataStudy implements ConsumerSeekAware {

	@KafkaListener(id = "shopping_cidadao.fiap.evento", //
			topicPartitions = { @TopicPartition(topic = "shopping_cidadao.fiap.evento", //
					partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "0")), })
	public void study(ConsumerRecord<Key, Envelope> evt) {
		
	}
}
