package filters;

public class CountingBloomFilter extends BloomFilter{
    public CountingBloomFilter(int new_num_entries, int new_bits_per_entry) {
        super(new_num_entries, new_bits_per_entry);
    }
}
