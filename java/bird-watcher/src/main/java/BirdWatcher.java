
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
//        throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
        return birdsPerDay;
    }

    public int getToday() {
//        throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
        if (birdsPerDay.length > 0) return getLastWeek()[birdsPerDay.length - 1];
        return 0;
    }

    public void incrementTodaysCount() {
//        throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
        int count = birdsPerDay.length - 1;
        birdsPerDay[count]++;
    }

    public boolean hasDayWithoutBirds() {
//        throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
        for (int zeroDay : birdsPerDay) {
            if (zeroDay == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
//        throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
        int count = 0;
        if (numberOfDays >= 7) {
            for (int i = 0; i < 7; i++) {
                count += birdsPerDay[i];
            }
        } else
            for (int i = 0; i < numberOfDays; i++) {
                count += birdsPerDay[i];
            }
        return count;
    }

    public int getBusyDays() {
//        throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
        int counter = 0;
        for (int days : birdsPerDay) {
            if (days >= 5) counter++;
        }
        return counter;
    }
}
