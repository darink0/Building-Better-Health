#!/usr/bin/perl
use strict;
use warnings;

# Libraries
use Getopt::Long;
use File::Basename;
use File::Path qw(make_path);
use Data::Dumper;

# Initialize
my $programName = basename($0);
my $input_file = '';
my $output_dir = '.';

# Input Options
GetOptions("file=s" => \$input_file, "out=s" => \$output_dir)
    or display_usage_and_exit();

 if (!$input_file) {
     display_usage_and_exit();
 }

# Check Output Directory
if (! -d $output_dir) {
    make_path($output_dir) or die "Unable to create directory: $output_dir\n";
}

# Open File
open my $INPUT, "<", $input_file or die "Unable to open file: $input_file\n";

# Process Data
my %data_hash;
while (my $line = <$INPUT>) {
    chomp($line);
    my ($name, $data) = split(/\t/, $line);

    if ($name && $data) {
        $data_hash{$name} = $data;
    }
}
close $INPUT;

# Output Data
my $out_file = $output_dir . "/" . $programName . "_output.txt";
open my $OUTPUT, ">", $out_file or die "Unable to create output file: $out_file\n";

foreach my $name (sort keys %data_hash) {
    my $data = $data_hash{$name};
    print $OUTPUT "$name\t$data\n";
}
close $OUTPUT;

# Subroutines
sub display_usage_and_exit {
    print "
Usage: $programName -f <input file> [-o <output directory>]

Description:
    This program will create a report based on the input data

Options:
    -f   Input file
    -o   Output directory [default = current directory]

";
    exit 1;
}

# Main
# Building Better Health

# 1. Increase public awareness of the importance of health
# Promote health-related messages in traditional and social media, as well as in schools and other educational settings. 
# Provide resources and trainings to help people identify and manage health risks.

# 2. Expand access to preventative health care
# Increase access to preventative health care for all individuals, especially those from vulnerable populations. 
# Work with providers to ensure people are aware of their rights and have access to preventive care.

# 3. Expand research and development on health-related issues
# Increase investment in research and development focused on improving the health of populations. 
# Support initiatives to create innovative solutions to health-related issues. 

# 4. Increase access to quality health care
# Expand access to quality health care for all individuals. 
# Support initiatives that focus on providing better access to health care services.

# 5. Improve health education
# Increase access to health education for all individuals. 
# Provide training to health care providers to ensure they are knowledgeable and up-to-date on the latest health science.

# 6. Develop strategies to reduce health disparities
# Create and implement strategies to reduce health disparities and increase health equity. 
# Ensure that all individuals, regardless of income, race, disability, or other characteristics, have access to quality health care. 

# 7. Improve health literacy 
# Increase awareness of health literacy and its importance among individuals, health care providers, and policy makers. 
# Provide opportunities to improve health literacy through programs, materials, and other resources. 

# 8. Strengthen public health infrastructure
# Improve public health infrastructure to better prevent, detect, and respond to health-related issues. 
# Increase public health funding to support the development of effective public health interventions. 

# 9. Monitor health care trends
# Track health care trends and patterns to identify areas of concern and areas of opportunity for improvement. 
# Provide data and analysis to inform policy decisions and health care strategies. 

# 10. Increase access to health resources
# Increase access to health resources, such as health insurance, educational materials, and other resources. 
# Work to eliminate barriers to health care access, such as high costs, language barriers, and transportation issues.